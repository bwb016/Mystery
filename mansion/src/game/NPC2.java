package game;

import static helpers.Clock.Delta;
import helpers.Counter;

import org.newdawn.slick.Animation;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.opengl.Texture;

public class NPC2 {
	private enum NPC_State2 {
		UP, DOWN, LEFT, RIGHT;
	}

	private static NPC_State2 npcState;
	private static NPC_State2 lastRender;

	private static float speed1, x1, y1;
	private static CollisionGrid collide1;
	private static String file1;
	private static Animation ani1;

	private static SpriteSheet sheet1;

	private static int spriteWidth1;

	private static int spriteHeight1;

	public static Animation render() {
		try {
			sheet1 = new SpriteSheet(file1, spriteWidth1, spriteHeight1);
		} catch (SlickException e) {
			e.printStackTrace();
		}
		ani1 = new Animation(sheet1, (int) (speed1 * 4));
		return ani1;
	}

	private boolean first = true, alive = true, rendered = false;
	private TileGrid grid;
	private Tile startTile;
	private Texture texture;
	private int width, height, health;
	private int direction = 1;
	private Counter walkCounter, resetCounter;
	private Counter counter;
	private boolean changedDirection = false;
	private int RIGHT,LEFT,UP,DOWN;

	public NPC2(String file, GameCharSprite character, CollisionGrid collide2,
			int spriteWidth, int spriteHeight, Tile startTile, TileGrid grid,
			int width, int height, int speed, int health, CollisionGrid collide) {
		this.file1 = file;
		this.spriteWidth1 = spriteWidth;
		this.spriteHeight1 = spriteHeight;
		this.x1 = startTile.getX();
		this.y1 = startTile.getY();
		this.speed1 = speed;
		this.collide1 = collide;
		this.startTile = startTile;
		this.health = health;
		this.width = width;
		this.height = height;
		this.grid = grid;
		this.counter = new Counter(2, 2);

	}

	private void direction() {
		switch (npcState) {
		case UP:

			setFile(getSprite(UP));
			render();
			lastRender = NPC_State2.UP;
			break;
		case DOWN:
			setFile(getSprite(DOWN));
			render();
			lastRender = NPC_State2.DOWN;
			break;
		case LEFT:
			setFile(getSprite(LEFT));
			render();
			lastRender = NPC_State2.LEFT;
			break;
		case RIGHT:
			setFile(getSprite(RIGHT));
			render();
			lastRender = NPC_State2.RIGHT;
			break;

		}

	}
public void setSprite(String name) {
	switch(name){
	case "robot":
		spriteHeight1 = 64;
		spriteWidth1 = 448/7; 
		width = 448/7;
		height = 64;
		UP = 0;
		DOWN = 1;
		LEFT = 2;
		RIGHT = 3;
		break;
	case "skeleton":
		spriteHeight1 = 64;
		spriteWidth1 = 170/4; 
		width = 170/4;
		height = 64;
		UP = 4;
		DOWN = 5;
		LEFT = 6;
		RIGHT = 7;
		break;
	case "benedict":
		spriteHeight1 = 129;
		spriteWidth1 = 518/7; 
		width = (518/7)/2;
		height = 64;
		UP = 8;
		DOWN = 9;
		LEFT = 10;
		RIGHT = 11;
	case "cecil":
		spriteHeight1 = 129;
		spriteWidth1 = 518/7; 
		width = (518/7)/2;
		height = 64;
		UP = 12;
		DOWN = 13;
		LEFT = 14;
		RIGHT = 15;
		break;
	}
	
}
	private String getSprite(int file) {
		switch (file) {
		case 0:
			return "res/redirect3.png";
		case 1:
			return "res/redirect4.png";
		case 2:
			return "res/redirect2.png";
		case 3:
			return "res/redirect.png";
		case 4:
			setSpriteWidth(170/4);
			setSpriteHeight(64);
			
			return "res/skeleton_r.png";
		case 5:
			setSpriteWidth(170/4);
			setSpriteHeight(64);
			return "res/skeleton_r.png";
		case 6:
			setSpriteWidth(170/4);
			setSpriteHeight(170);
			return "res/skeleton_r.png";
		case 7:
			setSpriteWidth(170/4);
			setSpriteHeight(64);
			return "res/skeleton_r.png";
		case 8: 
			return "res/images/benedictU.png";
		case 9: 
			return "res/images/benedictD.png";
		case 10: 
			return "res/images/benedictL.png";
		case 11: 
			return "res/images/benedictR.png";
		case 12: 
			return "res/images/cecilU.png";
		case 13: 
			return "res/images/cecilD.png";
		case 14: 
			return "res/images/cecilL.png";
		case 15: 
			return "res/images/cecilR.png";
		}

		return null;
		// TODO Auto-generated method stub

	}

	public static int getSpriteWidth() {
		return spriteWidth1;
	}

	public static void setSpriteWidth(int spriteWidth) {
		NPC2.spriteWidth1 = spriteWidth;
	}

	public static int getSpriteHeight() {
		return spriteHeight1;
	}

	public static void setSpriteHeight(int spriteHeight) {
		NPC2.spriteHeight1 = spriteHeight;
	}

	public boolean findNextB() {

		if (collide1.getTile((int) Math.floor(getX() / 16),
				(int) Math.floor(getY() / 16 + 2)).canCollide()) {
			{
				// System.out.println("Bottom");
				return true;
			}
		}
		return false;

	}

	public boolean findNextL() {

		if (collide1.getTile((int) Math.floor(getX() / 16 - 1),
				(int) Math.floor(getY() / 16) + 1).canCollide()) {
			{
				// System.out.println("Left"+getXInt2());
				return true;
			}
		}
		return false;

	}

	public boolean findNextR() {

		if (collide1.getTile((int) Math.floor(getX() / 16 + 1),
				(int) Math.floor(getY() / 16) + 1).canCollide()) {
			{
				// System.out.println("Right");
				return true;
			}
		}
		return false;

	}

	public boolean findNextT() {

		if (collide1.getTile((int) Math.floor(getX() / 16),
				(int) Math.ceil(getY() / 16 - 1)).canCollide()) {
			{
				// System.out.println("Top");
				return true;
			}
		}
		return false;

	}

	public int getHealth() {
		return health;
	}

	public float getX() {
		return x1;
	}

	public int getXInt() {
		return (int) Math.floor(getX() * 3 / TileGrid.tileSize);
	}

	public int getXInt2() {
		return (int) Math.floor(getX() / TileGrid.tileSize);
	}

	public float getY() {
		return y1;
	}

	public int getYInt() {
		return (int) Math.floor(getY() * 2 / (TileGrid.tileSize));
	}

	public int getYInt2() {
		return (int) Math.floor(getY() / TileGrid.tileSize);
	}

	public NPC_State2 randomDirection() {
		int caseNum = (int) (Math.random() * 8) + 1;

		switch (caseNum) {
		case 1:
			return NPC_State2.UP;
		case 2:
			return NPC_State2.DOWN;
		case 3:
			return NPC_State2.LEFT;
		case 4:
			return NPC_State2.RIGHT;
		case 5:
			return NPC_State2.UP;
		case 6:
			return NPC_State2.DOWN;
		case 7:
			return NPC_State2.LEFT;
		case 8:
			return NPC_State2.RIGHT;

		}
		return null;

	}

	public void setDirection(int caseNum) {

		switch (caseNum) {
		case 1:
			npcState = NPC_State2.UP;
			break;
		case 2:
			npcState = NPC_State2.DOWN;
			break;
		case 3:
			npcState = NPC_State2.LEFT;
			break;
		case 4:
			npcState = NPC_State2.RIGHT;
			break;
		case 5:
			npcState = NPC_State2.UP;
			break;
		case 6:
			npcState = NPC_State2.DOWN;
			break;
		case 7:
			npcState = NPC_State2.LEFT;
			break;
		case 8:
			npcState = NPC_State2.RIGHT;
			break;

		}

	}

	public void setFile(String file) {
		this.file1 = file;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void Update(boolean b) {
		// System.out.println((currentTime - StartTime)/1000);

		// npcState = npcState.RIGHT;
		if (rendered == false) {
			npcState = randomDirection();
			render();
			rendered = true;
		}
		ani1.draw(x1, y1, width, height);

		ani1.stop();
		counter.Update();
		if (!b) {

			if (!Counter.isRunning()) {
				if (changedDirection) {
					Counter.setCountTime((int) (Math.random() * 6 + 1));
					npcState = randomDirection();
					changedDirection = false;
				}
			}

			if (Counter.isRunning()) {
				changedDirection = true;
				switch (npcState) {
				case RIGHT:
					npcState = NPC_State2.RIGHT;
					if (lastRender != NPC_State2.RIGHT) {
						direction();
					}
					if (x1 < TileGrid.tileSize * TileGrid.COLUMN - 64
							&& !findNextR()) {
						if (true) {
							ani1.start();
							ani1.draw(x1, y1, width, height);
							x1 += Delta() * speed1;
						}

					}

					break;
				case LEFT:
					npcState = NPC_State2.LEFT;
					if (lastRender != NPC_State2.LEFT) {
						direction();
					}
					if (x1 > 16 && !findNextL()) {
						if (true) {
							ani1.start();
							ani1.draw(x1, y1, width, height);
							x1 -= Delta() * speed1;
						}

					}
					break;
				case UP:
					npcState = NPC_State2.UP;
					if (lastRender != NPC_State2.UP) {
						direction();
					}
					if (y1 > TileGrid.tileSize / 4 && !findNextT()) {
						if (true) {
							ani1.start();
							ani1.draw(x1, y1, width, height);
							y1 -= Delta() * speed1;
						}

					}
					break;
				case DOWN:
					npcState = NPC_State2.DOWN;
					if (lastRender != NPC_State2.DOWN) {
						direction();
					}
					if (y1 < TileGrid.tileSize * TileGrid.ROW - 80
							&& !findNextB()) {
						if (true) {
							ani1.start();
							ani1.draw(x1, y1, width, height);
							y1 += Delta() * speed1;
						}

					}
					break;

				}
			}
		}
	}

	public void Update2(boolean b) {
		if (rendered == false) {

			render();
			rendered = true;
		}
		ani1.draw(x1, y1, width, height);

		ani1.stop();

		if (b) {
			changedDirection = true;
			switch (npcState) {
			case RIGHT:
				npcState = NPC_State2.RIGHT;
				if (lastRender != NPC_State2.RIGHT) {
					direction();
				}
				if (x1 < TileGrid.tileSize * TileGrid.COLUMN - 64
						&& !findNextR()) {
					if (true) {
						ani1.start();
						ani1.draw(x1, y1, width, height);
						x1 += Delta() * speed1;
					}

				}

				break;
			case LEFT:
				npcState = NPC_State2.LEFT;
				if (lastRender != NPC_State2.LEFT) {
					direction();
				}
				if (x1 > 16 && !findNextL()) {
					if (true) {
						ani1.start();
						ani1.draw(x1, y1, width, height);
						x1 -= Delta() * speed1;
					}

				}
				break;
			case UP:
				npcState = NPC_State2.UP;
				if (lastRender != NPC_State2.UP) {
					direction();
				}
				if (y1 > TileGrid.tileSize / 4 && !findNextT()) {
					if (true) {
						ani1.start();
						ani1.draw(x1, y1, width, height);
						y1 -= Delta() * speed1;
					}

				}
				break;
			case DOWN:
				npcState = NPC_State2.DOWN;
				if (lastRender != NPC_State2.DOWN) {
					direction();
				}
				if (y1 < TileGrid.tileSize * TileGrid.ROW - 80 && !findNextB()) {
					if (true) {
						ani1.start();
						ani1.draw(x1, y1, width, height);
						y1 += Delta() * speed1;
					}

				}
				break;

			}
		}
	}

	public static void setX(float x) {
		x1 = x;
	}

	public static void setY(float y) {
		y1 = y;
	}
}
