//ur fn
function greeting(name) {
    console.log(`Hello ${name}`);
}
//another fn pass var in it
function getUserInput(callbackfn) {
    var name = prompt('Please enter ur name');
    callbackfn(name);
}
getUserInput(greeting);