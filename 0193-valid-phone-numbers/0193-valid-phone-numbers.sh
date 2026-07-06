# Read from the file file.txt and output all valid phone numbers to stdout.
sed -nE '/^([0-9]{3}-[0-9]{3}-[0-9]{4}|\([0-9]{3}\) [0-9]{3}-[0-9]{4})$/p' file.txt