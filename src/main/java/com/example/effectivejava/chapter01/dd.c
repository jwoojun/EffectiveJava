do {
flag[i]= true;
turn = j;
while(flag[j] && turn == j);
critical_section
flag[i]=false;
remainder_section
}while(1);