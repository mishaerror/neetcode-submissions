class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int lRow = 0;
        int hRow = rows - 1;
        //locate row
        int mid;

        int rowPos = -1;
        //looking for a row where matrix[row][0]<=target && matrix[row][0]>=target
        while(lRow <= hRow) {
            mid = (hRow + lRow ) / 2;
            int midRowLength = matrix[mid].length;
            if(isTargetInRow(matrix[mid], target)) {
                rowPos = mid;
                break;
            }
            if(matrix[mid][0]>target) {
                hRow = mid - 1;
            } else if(matrix[mid][midRowLength-1]<target) {
                lRow = mid + 1;
            }
        }

        if(rowPos < 0) {
            return false;
        }

        int[] targetRow = matrix[rowPos];

        //binary search through row for target

        int l = 0;
        int r = targetRow.length -1;


        while(l<=r) {
            mid = (l+r)/2;

            if(targetRow[mid]==target) {
                return true;
            }

            if(targetRow[mid] > target) {
                r = mid - 1;
            }

            if(targetRow[mid] < target) {
                l = mid+1;
            }
        }

        return false;
    }

    private boolean isTargetInRow(int[] row, int target) {
       return row[0]<=target && row[row.length -1]>=target;
    }
}
