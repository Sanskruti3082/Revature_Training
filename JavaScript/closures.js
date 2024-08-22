function greeting(){
    var msg="Hi"

    function sayHi(){
        console.log(msg);
    }
    return sayHi
}

let res=greeting();
res();