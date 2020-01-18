package chained_list;

import dao.DAO;

public class Program {

	public static void main(String[] args) {
		DAO daoChainedList = new DAO();
		daoChainedList.addNode(37);
		daoChainedList.addNode(38);
		daoChainedList.addNode(39);
		daoChainedList.addNode(40);
		daoChainedList.addNode(41);
		
		try {
			//System.out.println(daoChainedList.getNodeInfo(1));
			daoChainedList.removeNodeFromList(3);
			for (int i = 0; i < 4; i++) {
				System.out.println(daoChainedList.getNodeInfo(i));
			}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		catch (IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
