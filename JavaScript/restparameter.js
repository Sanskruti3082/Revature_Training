function func(...input){
    let sum=0
    for(let i of input){
        sum +=i;
    }
    return sum
}

console.log(func(2,3))
console.log(func(1,2,3,4))