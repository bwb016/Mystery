package game;

public class Cutscene {
	
	public TileGrid grid2 = new TileGrid(Map.Ballroom3());
	private boolean b = true;
	public static Dialogue dialogue;
	private static String[] dialogueText;
	
	public Cutscene(Game game) {

		dialogueText = DialogueText.ballroomSceneAfterCutscene();
		dialogue = new Dialogue(game, dialogueText);
		
		
	}
	public String[] getDialogueText() {
		return dialogueText;
	}
	public void setDialogueText(String[] dialogueText) {
		this.dialogueText = dialogueText;
	}
	public void Update(NPCmanager npcMan){
		
		
		
		if(b ){
		this.grid2.setGrid(Map.Ballroom3());
		b = false;
		}
		this.grid2.Update();
		this.grid2.Draw();
		
		npcMan.Update();
		dialogue.Update();
		
		
		
	}

}
