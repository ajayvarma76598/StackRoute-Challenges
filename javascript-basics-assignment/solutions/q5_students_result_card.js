// Write a program to display one result card of 100 students
// with their name and percentage
// Out of 100 students, 50 has subjects - Grammer and Accounts
// and other 50 has subjects -  Grammer and Physics

// Hint : You need to calculate percentage of 100 students having different set of subjects.
//        You can assume their scores on their respective subjects.


// Write your code here
const results=()=>{
    const studentsList=[
    {name:'davis',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    {name:'benny',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    {name:'tharun',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    {name:'uma',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    {name:'arun',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    {name:'pallavi',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    {name:'priyanka',subjects:[{subject:'Grammer',marks:80},{subject:'Accounts',marks:79}]},
    ];
    const result=()=>
    studentsList.reduce((obj,item)=> {
        let percenRes=item.subjects.reduce(()=>{
            return (item.subjects[0].marks+item.subjects[1].marks)/item.subjects.length;
        }, {})
    }, {})
    const finResult=result(studentList);
    return finResult;
}
result();