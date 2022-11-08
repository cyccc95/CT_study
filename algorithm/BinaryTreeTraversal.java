class Node {
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTreeTraversal {
    static void preOrder(Node ptr){
        if (ptr != null){
            System.out.print(ptr.data + " ");
            preOrder(ptr.left);
            preOrder(ptr.right);
        }
    }
    static void inOrder(Node ptr){
        if (ptr != null){
            inOrder(ptr.left);
            System.out.print(ptr.data + " ");
            inOrder(ptr.right);
        }
    }
    static void postOrder(Node ptr){
        if (ptr != null){
            postOrder(ptr.left);
            postOrder(ptr.right);
            System.out.print(ptr.data + " ");
        }
    }
    public static void main(String[] args) {
        int number = 15;
        Node[] nodes = new Node[number + 1];
        for (int i = 1; i <= number; i++){
            Node node = new Node(i);
            nodes[i] = node;
            nodes[i].left = null;
            nodes[i].right = null;
        }
        for (int i = 2; i <= number; i++){
            if (i % 2 == 0){
                nodes[i/2].left = nodes[i];
            } else {
                nodes[i/2].right = nodes[i];
            }
        }
        System.out.println("전위 순회");
        preOrder(nodes[1]);
        System.out.println("\n중위 순회");
        inOrder(nodes[1]);
        System.out.println("\n후위 순회");
        postOrder(nodes[1]);
    }
}

// 이진 트리는 트리 자료구조를 활용한 대표적인 예시로 데이터의 탐색 속도 증진을 위해 사용하는 구조

// 완전 이진 트리가 아닌 이진 트리는 배열로 표현하기 어렵기 때문에
// 포인터를 사용해서 특정한 루트(root)에서 자식 노드로 접근

// 1. 전위 순회(Preorder Traversal)
// 먼저 자기 자신을 처리합니다
// 왼쪽 자식을 방문합니다
// 오른쪽 자식을 방문합니다

// 2. 중위 순회(Inorder Traversal)
// 왼쪽 자식을 방문합니다
// 먼저 자기 자신을 처리합니다
// 오른쪽 자식을 방문합니다

// 3. 후위 순회(Postorder Traversal)
// 왼쪽 자식을 방문합니다
// 오른쪽 자식을 방문합니다
// 먼저 자기 자신을 처리합니다

