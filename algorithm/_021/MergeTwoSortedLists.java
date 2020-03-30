package _021;

/*
Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

참고 : 
https://github.com/Blankj/awesome-java-leetcode/blob/master/src/com/blankj/easy/_021/Solution.java
*/


public class MergeTwoSortedLists {
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode head = new ListNode(0);
	        ListNode temp = head;
	        while (l1 != null && l2 != null) {
	            if (l1.val < l2.val) {
	                temp.next = l1;
	                l1 = l1.next;
	            } else {
	                temp.next = l2;
	                l2 = l2.next;
	            }
	            temp = temp.next;
	        }
	        temp.next = l1 != null ? l1 : l2;
	        return head.next;
	    }
	
	public static void main(String[] args) {
	        ListNode listNode0 = ListNode.createTestData("[1,3,5,7,9]");
	        ListNode listNode1 = ListNode.createTestData("[2,4,6,8,10]");
	        ListNode.print(listNode0);
	        ListNode.print(listNode1);
	        ListNode.print(mergeTwoLists(listNode0, listNode1));

	}

	////////////////////////////////////////////////////////////////////
	
	public static class ListNode {

	    public int      val;
	    public ListNode next;

	    public ListNode(int x) {
	        val = x;
	    }

	    public static ListNode createTestData(String data) {
	        if (data.equals("[]")) return null;
	        data = data.substring(1, data.length() - 1);
	        String[] split = data.split(",");
	        int len = split.length;
	        ListNode[] listNode = new ListNode[len + 1];
	        listNode[0] = new ListNode(Integer.valueOf(split[0]));
	        for (int i = 1; i < len; i++) {
	            listNode[i] = new ListNode(Integer.valueOf(split[i]));
	            listNode[i - 1].next = listNode[i];
	        }
	        return listNode[0];
	    }

	    public static void print(ListNode listNode) {
	        if (listNode == null) {
	            System.out.println("null");
	            return;
	        }
	        StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
	        ListNode p = listNode.next;
	        while (p != null) {
	            str.append(",").append(String.valueOf(p.val));
	            p = p.next;
	        }
	        System.out.println(str.append("]"));
	    }
	}
	
}
