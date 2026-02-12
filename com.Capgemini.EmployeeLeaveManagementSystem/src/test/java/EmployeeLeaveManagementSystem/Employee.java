package EmployeeLeaveManagementSystem;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String department;
    private int totalLeavesAllocated;
    private int leavesTaken;

    public Employee(String employeeId, String employeeName,
                    String department, int totalLeavesAllocated, int leavesTaken) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.totalLeavesAllocated = totalLeavesAllocated;
        this.leavesTaken = leavesTaken;
    }

    public int getTotalLeavesAllocated() {
        return totalLeavesAllocated;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
}
