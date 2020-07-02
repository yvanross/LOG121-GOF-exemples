package Mediateur.Storage;

import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

class Mediator<T> {
    private final HashMap<String, Storage<T>> storageMap = new HashMap<>();
    private final CopyOnWriteArrayList<Consumer<String>> observers = new CopyOnWriteArrayList<>();
    
    public void setValue(String storageName, T value) {
        Storage storage = storageMap.computeIfAbsent(storageName, name -> new Storage<>());
        storage.setValue(this, storageName, value);
    }
    
    public Optional<T> getValue(String storageName) {
        return Optional.ofNullable(storageMap.get(storageName)).map(Storage::getValue);
    }
    
    public void addObserver(String storageName, Runnable observer) {
        observers.add(eventName -> {
            if (eventName.equals(storageName)) {
                observer.run();
            }
        });
    }
    
    void notifyObservers(String eventName) {
        observers.forEach(observer -> observer.accept(eventName));
    }
}