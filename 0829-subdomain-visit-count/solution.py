class Solution:
    def subdomainVisits(self, cpdomains: list[str]) -> list[str]:
        d = {}
        for i in cpdomains :
            n, domains = i.split()
            n, domains = int(n), domains.split('.')
            for j in range(len(domains)) :
                _str = '.'.join(domains[j:])
                d[_str] = d[_str] + n if _str in d else n
        return [str(d[i]) + ' ' + i for i in d]                
