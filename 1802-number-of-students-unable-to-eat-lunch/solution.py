class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        count0 = students.count(0)
        count1 = students.count(1)

        for sand in sandwiches :
            if sand == 0 :
                if count0 > 0 :
                    count0-=1
                else :
                    break
            else :
                if count1 > 0 :
                    count1-=1
                else :
                    break
        return count0+count1 

