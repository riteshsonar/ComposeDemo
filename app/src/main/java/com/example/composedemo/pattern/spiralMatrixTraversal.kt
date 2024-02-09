package com.example.composedemo.pattern


//spiral matrix traversal
// https://www.youtube.com/watch?v=1ZGJzvkcLsA
//https://www.youtube.com/watch?v=3Zv-s9UUrFM
fun main(){
    val mat = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    val ans = printSpiral(mat)

    for (i in 0 until ans!!.size) {
        print(ans[i].toString() +" "  )
    }
    println()
}

fun printSpiral(mat: Array<IntArray>): List<Int>? {

    // Define ans list to store the result.
    val ans: MutableList<Int> = ArrayList()
    val n = mat.size // no. of rows
    val m = mat[0].size // no. of columns

    // Initialize the pointers required for traversal.
    var top = 0
    var left = 0
    var bottom = n - 1
    var right = m - 1

    // Loop until all elements are not traversed.
    while (top <= bottom && left <= right) {

        // For moving left to right
        for (i in left..right) ans.add(mat[top][i])
        top++

        // For moving top to bottom.
        for (i in top..bottom) ans.add(mat[i][right])
        right--

        // For moving right to left.
        if (top <= bottom) {
            for (i in right downTo left) ans.add(mat[bottom][i])
            bottom--
        }

        // For moving bottom to top.
        if (left <= right) {
            for (i in bottom downTo top) ans.add(mat[i][left])
            left++
        }
    }
    return ans
}

/*
* vector<int> Solution::spiralOrder(const vector<vector<int> > &A) {

    int T,B,L,R,dir;
    T=0;
    B=A.size()-1;
    L=0;
    R=A[0].size()-1;
    dir=0;
    int i;
    vector<int> ans;

    while(T<=B && L<=R)
    {
        if(dir==0)
        {
            for(i=L;i<=R;i++)
                ans.push_back(A[T][i]);
            T++;
        }
        else if(dir==1)
        {
            for(i=T;i<=B;i++)
                ans.push_back(A[i][R]);
            R--;
        }
        else if(dir==2)
        {
            for(i=R;i>=L;i--)
                ans.push_back(A[B][i]);
            B--;
        }
        else if(dir==3)
        {
            for(i=B;i>=T;i--)
                ans.push_back(A[i][L]);
            L++;
        }
        dir=(dir+1)%4;
    }
    return ans;
}*/