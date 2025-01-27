package Leetcode;
//leetcode - 1462
//https://leetcode.com/problems/course-schedule-iv/description/
import java.util.ArrayList;
import java.util.List;

public class CourseScheduleIV {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites ={{1,0}};
        int[][] queries = {{0,1},{1,0}};
        System.out.println(checkIfPrerequisite(numCourses,prerequisites,queries));
    }
    static public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] isPrerequisite = new boolean[numCourses][numCourses];

        // Populate the graph with direct prerequisites
        for (int[] prerequisite : prerequisites) {
            isPrerequisite[prerequisite[0]][prerequisite[1]] = true;
        }

        // Use Floyd-Warshall to find transitive prerequisites
        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    isPrerequisite[i][j] |= isPrerequisite[i][k] && isPrerequisite[k][j];
                }
            }
        }

        // Process the queries
        List<Boolean> ans = new ArrayList<>();
        for (int[] query : queries) {
            ans.add(isPrerequisite[query[0]][query[1]]);
        }

        return ans;
    }
}
