package Mediateur.Chat;

public interface Mediator {

	void sendMessage(String message, Collegue user);

	void addUser(Collegue user);

}
