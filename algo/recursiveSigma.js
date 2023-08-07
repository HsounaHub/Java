function recursiveSigma(n){
    var total =n;
    if(n===1){
        return 1
    }
    if(n<1){
        return 0
    }
    return total+=recursiveSigma(n-1)
}

console.log(recursiveSigma(7));