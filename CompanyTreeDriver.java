public class CompanyTreeDriver {
    public static void main (String[] args) {
        GeneralTreeNode root = new GeneralTreeNode("CEO");
        GeneralTreeNode sales = new GeneralTreeNode("VP of sales");
        GeneralTreeNode engineering = new GeneralTreeNode("VP of engineering");

        root.addChild(sales);
        root.addChild(engineering);

        sales.addChild(new GeneralTreeNode ("Sales Manager (NA)"));
        sales.addChild(new GeneralTreeNode("Sales Manager (EU)"));

        GeneralTreeNode devTeam = new GeneralTreeNode("Dev Team Lead");

        engineering.addChild(devTeam);
        devTeam.addChild(new GeneralTreeNode("Developer 1"));
        devTeam.addChild(new GeneralTreeNode("Developer 2"));

        engineering.addChild(new GeneralTreeNode("QA Team Lead"));

        System.out.println("Preorder Traversal:");
        root.preorderTransversal();
        System.out.println("\nPostorder Traversal:");
        root.postorderTransversal();
    }
}