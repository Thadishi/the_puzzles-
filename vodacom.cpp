//
//  Vodacom.c
//  
//
//  Created by Thabo Kopane on 2019/06/26.
//

#include "Vodacom.h"

#include <isotream>
using namespace std;

class abc{
public:
    int i;
    
    abc(int i){
        i=i;
    }
};

main(){
    abc m(5);
    
    cout<<m.i;
}
