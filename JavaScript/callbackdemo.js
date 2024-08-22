function doHomework(subject,callback){
    //console.log("Doing my "+subject+" Homework")

    //using back tick for dynamic values--> called as template literals
    console.log(`Doing my ${subject} homework`)
   // alertFinished()
    callback();
}

function alertFinished(){
    console.log("Home work finished")
   
}

// function alertFinished(marks,callback){
//     console.log("Home work finished")
//     console.log(`${marks}`)
//     callback();
// }

// function check(status){
//     console.log(`${status}`)
    
// }

doHomework("English",alertFinished)

