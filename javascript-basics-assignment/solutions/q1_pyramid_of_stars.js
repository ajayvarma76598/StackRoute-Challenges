/* Write a program to build a `Pyramid of stars` of given height */

const buildPyramid = (size) => {
    let row = '';
    let i,j,k;
    for (i=1; i<=size; i += 1){
        for(k=1; (k<=size-i); k += 1){
            row += ' ';
        }
        for(j=1; j<=i; j += 1 ){
          row += ' *';
        }
        row += "  \n";
    }
    return row;
};

/* For example,
INPUT - buildPyramid(6)
OUTPUT -
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

module.exports = buildPyramid;
