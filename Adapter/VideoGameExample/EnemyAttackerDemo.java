package DesignPatterns.Adapter.VideoGameExample;

public class EnemyAttackerDemo {

    public static void main(String... args) {

        EnemyTank robot1 = new EnemyTank();

        EnemyRobot robot2 = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot2);

        System.out.println("The robot");
        robot2.reactToHuman("Paul");
        robot2.walkForward();
        robot2.smashWithHands();

        System.out.println("The enemy tank");
        robot1.assignDriver("Frank");
        robot1.driveForward();
        robot1.fireWeapon();

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
