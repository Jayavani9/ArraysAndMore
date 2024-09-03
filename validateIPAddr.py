#https://leetcode.com/problems/validate-ip-address/

//Tc: O(n)  Sc: O(n) 
class Solution:
    def validIPAddress(self, queryIP: str) -> str:
        def is_valid_ipv4(parts):
            if len(parts) != 4:
                return False
            for part in parts:
                if not part.isdigit() or not 0 <= int(part) <= 255 or (part[0] == '0' and len(part) > 1):
                    return False
            return True
        def is_valid_ipv6(parts):
            if len(parts) != 8:
                return False
            for part in parts:
                if len(part) == 0 or len(part) > 4 or not all(c in '0123456789abcdefABCDEF' for c in part):
                    return False
            return True
        if '.' in queryIP:
            parts = queryIP.split('.')
            if is_valid_ipv4(parts):
                return "IPv4"
        elif ':' in queryIP:
            parts = queryIP.split(':')
            if is_valid_ipv6(parts):
                return "IPv6"
        
        return "Neither"
