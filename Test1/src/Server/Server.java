package Server;

public class Server {


	public Server(int screen, int mouseclick, int mousemove) {
		ScreenThread st = new ScreenThread(screen);
		new Thread(st).start();
		MouseThread mt = new MouseThread(mousemove);
		new Thread(mt).start();
		MouseCLickThread mct = new MouseCLickThread(mouseclick);
		new Thread(mct).start();

	}

}
