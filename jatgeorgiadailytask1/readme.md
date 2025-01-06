Description:Given an input string, reverse the order of the words. A word is defined as a sequence
of non-space characters.Example: Input: "the sky is blue" Output: "blue is sky the" Input: " hello world
"Output: "world hello"
corner cases:
- blank string -> another CustomException with msg:"empty"
- one word input -> throw custom Exception
- Capital letters -> should stay on their position

Example:
 - "the sky is blue" → "blue is sky the"
 - "Hello world With capital letters" → "Hello letters With capital world"
