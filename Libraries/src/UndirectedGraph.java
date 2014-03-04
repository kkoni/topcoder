import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UndirectedGraph<T> {
    private UndirectedGraph(List<T> nodes, boolean[][] adjacencyMatrix, int[][] edgeWeights) {
        this.nodes = nodes;
        this.adjacencyMatrix = adjacencyMatrix;
        this.edgeWeights = edgeWeights;
        this.adjacentNodes = createAdjacentNodes(adjacencyMatrix);
    }

    private int[][] createAdjacentNodes(boolean[][] adjacencyMatrix) {
        return new int[0][];
    }

    private final List<T> nodes;
    private final boolean[][] adjacencyMatrix;
    private final int[][] edgeWeights;
    private final int[][] adjacentNodes;

    public T getNode(int n) {
        validateIndex(n);
        return nodes.get(n);
    }

    public int[] getAdjacentNodes(int n) {
        validateIndex(n);
        return adjacentNodes[n];
    }

    public boolean isAdjacent(int n1, int n2) {
        validateIndex(n1);
        validateIndex(n2);
        return adjacencyMatrix[n1][n2];
    }

    public int getEdgeWeights(int n1, int n2) {
        if(!isAdjacent(n1, n2)) {
            throw new IllegalArgumentException();
        }
        return edgeWeights[n1][n2];
    }

    private void validateIndex(int index) {
        if(nodes.size() <= index) {
            throw new IllegalArgumentException();
        }
    }
}
