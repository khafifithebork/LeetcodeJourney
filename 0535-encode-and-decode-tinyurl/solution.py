class Codec:
    def __init__(self):
        self.url_map = {}
        self.id_counter = 0
    
    def encode(self, long_url: str) -> str:
        code = str(self.id_counter)
        self.id_counter += 1
        self.url_map[code] = long_url
        return f"http://shorten/{code}"
    
    def decode(self, short_url: str) -> str:
        code = short_url.rsplit('/', 1)[-1]
        return self.url_map[code]

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))
