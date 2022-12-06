public class Application {
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree(5);
        // отображение дерева:
        tree.printTree();

        // вставляем узлы в дерево:
        tree.add(6);
        tree.add(8);
        tree.add(5);
        tree.add(8);
        tree.add(2);
        tree.add(9);
        tree.add(7);
        tree.add(4);
        tree.add(10);
        tree.add(3);
        tree.add(1);

        // отображение дерева:
        tree.printTree();

        // удаляем один узел и выводим оставшееся дерево в консоли
        tree.delete(5);
        tree.printTree();

        // находим узел по значению и выводим его в консоли
        Boolean contains = tree.contains(7);
        System.out.println(contains);

        tree.printSize();

        tree.toArray();
    }
}