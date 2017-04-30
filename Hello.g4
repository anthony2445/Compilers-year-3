grammar Hello;					// Define a grammar called Hello

/* Right from the textbook */
r 	: 'hello' ID ;				// match keyword hello followed by an identifier
ID 	: [a-z]+ ;					// match lower-case identifiers
WS	: [ \t\r\n]+ -> skip ; 		// skip spaces, tabs, newlines, \r (windows)