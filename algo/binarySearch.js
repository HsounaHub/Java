function binarySearch(sortednums,searchNum){
var leftIdx=0
var rightIdx=sortednums.length-1
var middleIDx=Math.floor((rightIdx+leftIdx)/2)
if(leftIdx>rightIdx){
    return false
}
if(sortednums[middleIDx]===searchNum){
    return true
}
if (searchNum<sortednums[middleIDx]) {
    binarySearch(sortednums.slice(0,middleIDx-1),searchNum)
}else{binarySearch(sortednums.slice(middleIDx+1),searchNum)}
}

const sortedArray = [1, 3, 5, 7, 9];
console.log(binarySearch(sortedArray,9));