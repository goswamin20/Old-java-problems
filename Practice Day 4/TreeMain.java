
public class TreeMain {

	public static void main(String[] args) {
	
		Entering e= new Entering();
		String treename=e.accept();
		UpdateTree u= new UpdateTree();
		u.update(treename);
	}

}
