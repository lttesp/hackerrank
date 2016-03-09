# Enter your code here. Read input from STDIN. Print output to STDOUT
a = int(raw_input());
b = int(raw_input());

tup = [a,b];
c,d = tup.index(a),tup.index(b);
tup[c],tup[d] = tup[d],tup[c];

for i in tup:
    print i;