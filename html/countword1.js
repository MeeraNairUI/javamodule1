function countcase (word){
    var upper=0;
    var lower=0;
	v=word.length
    console.log(v);

    for(var i=0;i<v;i++)
    {
        if(isUpperCase==word[i]){
            upper=upper+1;
        }
        else{
            lower=lower+1;
        }
    }
    console.log("lower"+lower);
    console.log("upper"+upper);
}
function isUpperCase(c){
    if(c<='A' && c>='Z')
      return true;
}
countcase("hello");