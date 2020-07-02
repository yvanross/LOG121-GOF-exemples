package Mediateur.Storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class Mediator<T> {
    private final HashMap<String, Storage<T>> storageMap = new HashMap<>();
    private Map<String, Runnable> observers = new ConcurrentHashMap<>();

    public void setValue(String storageName, T value) {
        Storage<T> storage;
        if (this.storageMap.containsKey(storageName)){
            storage = this.storageMap.get(storageName);
        } else {
            storage = new Storage<>();
            this.storageMap.put(storageName, storage);
        }

        storage.setValue(this, storageName, value);
    }

    public Optional<T> getValue(String storageName) {
        return Optional.ofNullable(storageMap.get(storageName)).map(Storage::getValue);
    }

    public void addObserver(String storageName, Runnable observer) {
        this.observers.put(storageName, observer);
    }

    void notifyObservers(String eventName) {
        if (this.observers.containsKey(eventName)){
            this.observers.get(eventName).run();
        }
    }
}