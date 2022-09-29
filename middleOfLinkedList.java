class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode currNode = head;
        int count = 0;
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }
        System.out.println(count);
        int middle = count/2;
        System.out.println(middle);

       currNode = head;
       
            for(int i=1; i<=count && currNode != null; i++){
                if(i == middle+1){
                    return currNode;
                }
                currNode = currNode.next;
            }
        return null;
        }
    }
