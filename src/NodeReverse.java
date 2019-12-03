/**
 * author:ljg
 * Data:2019/11/6 20:05
 * Description:
 */
public class NodeReverse {
    public static class Node {
        int obj;
        Node next;

        public Node() {

        }

        public Node(int obj, Node next) {
            this.obj = obj;
            this.next = next;
        }

        @Override
        public String toString() {
            String str = obj + " ";
            return str;
        }
    }


    /*
     * 三个节点，四行代码（迭代法）
     * 1、next指针指向下一个节点（now.next）
     * 2、当前节点指向上一个节点
     * 3、pre和now两个指针向后移动
     *
     * */
    public static Node reverseNode(Node node) {
        //单链表为空或只有一个节点，直接返回原单链表
        if (node == null || node.next == null) {
            return node;
        }

        Node pre = null;
        Node now = node;
        Node next;

        while (now != null) {
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }

        return pre;
    }


    public static void main(String[] args) {
        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        System.out.println("反转前：");
        Node tmp = node1;
        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.next;
        }

        System.out.println("反转后：");
        tmp = reverseNode(node1);
        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.next;
        }
    }

    /*
        反转前：
        1
        2
        3
        反转后：
        3
        2
        1
    */


}
