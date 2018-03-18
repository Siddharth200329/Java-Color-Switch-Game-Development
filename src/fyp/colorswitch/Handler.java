package fyp.colorswitch;

import fyp.colorswitch.gfx.GameCamera;
import fyp.colorswitch.input.MouseManager;

//Cette classe sert � passer nos variables d'une fa�on plus pratique 

public class Handler {
	
	private Game game;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	/*
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	*/
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}

}
