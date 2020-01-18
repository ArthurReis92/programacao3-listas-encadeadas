package dao;

import chained_list.Node;

public class DAO {
	private Node list = null;

	public void addNode(int info) {
		Node newNode = new Node();
		newNode.setInfo(info);

		if (list == null) {
			list = newNode;
		} else {
			Node temp = list;

			while (true) {
				if (temp.getNextNode() == null) {
					temp.setNextNode(newNode);
					break;
				}
				temp = temp.getNextNode();
			}
		}
	}

	public Integer getNodeInfo(int index) {
		Node node = list;
		int count = 0;
		int value = 0;
		if (index >= 0) {
			while (true) {
				if (index == count) {
					value = node.getInfo();
					break;
				} else if (node.getNextNode() != null) {
					node = node.getNextNode();
					count++;
				} else {
					throw new IndexOutOfBoundsException("O índice informado não existe na lista!");
				}
			}
			return value;
		} else {
			throw new IllegalArgumentException("Índice informado não é válido");
		}
	}

	public void removeNodeFromList(int index) {
		Node node = list;
		Node temp = null;
		int count = 0;

		if (index >= 0) {
			if (index == 0) {
				temp = list.getNextNode();
				list.setInfo(temp.getInfo());
				list.setNextNode(temp.getNextNode());
				
			} else {
				while (true) {
					count++;
					temp = node.getNextNode();
					if (index == count) {
						node.setNextNode(temp.getNextNode());
						temp.setNextNode(null);
						break;
					} else if (node.getNextNode() != null) {
						node = node.getNextNode();
					} else {
						throw new IndexOutOfBoundsException("O índice informado não existe na lista!");
					}
				}
			}
		} else {
			throw new IllegalArgumentException("Índice informado não é válido");
		}
	}
	
	public void alterNodeFromList(int index, int newInfo) {
		
	}

}
