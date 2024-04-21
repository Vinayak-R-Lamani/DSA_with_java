class Binary_search:
    def serach(arr,l , r,k):
        while (l <= r):
            mid = (l + r) // 2
            if arr[mid] == k:
                return mid
            elif arr[mid] > k:
                r = mid - 1
            else:
                l = mid + 1
        return -1
    
    def main():
        arr = [2,3,4,5,6,7]
        k = 5
        l = 0
        r = len(arr) - 1
        print(Binary_search.serach(arr,l,r,k))
        
if __name__ == "__main__":
    Binary_search.main()