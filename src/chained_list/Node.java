package chained_list;

public class Node {
	private Integer info;
	private Node nextNode;
	
	public Node() {
	}
	
	public Node(Integer info, Node nextNode) {
		this.info = info;
		this.nextNode = nextNode;
	}

	public Integer getInfo() {
		return info;
	}
	public void setInfo(Integer info) {
		this.info = info;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
}
