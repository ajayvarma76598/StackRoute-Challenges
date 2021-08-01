// Create a list of fruits with their properties (name, color, pricePerKg)
// and convert it into a format so that for a given fruit name
// retrieval of its color and pricePerKg value is fast


// Write your code here

const fruitArray=[
    {name:'banana',color:'yellow',price:100},
    {name:'grapes',color:'green',price:150},
    {name:'muskmelon',color:'orange',price:170},
    {name:'watermelon',color:'red',price:152},
];
const convertToobj=(fruitArray1,keyfield)=>
fruitArray1.reduce((obj,item) => {obj[item[keyfield]]=item;
    return obj;
    
}, {});
const fruitobj=convertToobj(fruitArray,'name');