class Solution {
public:
    int kthSmallest(vector<vector<int>>& matrix, int k) {
        int n = matrix.size();
        vector<int> list;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.push_back(matrix[i][j]);
                
            }
        }
        sort(list.begin(), list.end());
        return list[k-1];
    }
};
