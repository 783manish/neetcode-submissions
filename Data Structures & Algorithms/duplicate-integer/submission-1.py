class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hasCome=set({})
        for i in nums:
            if i in hasCome:
                return True
            hasCome.add(i)
        return False
        
        