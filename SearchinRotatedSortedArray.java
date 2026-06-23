class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) { //sol sıralıysa

                if (nums[low] <= target && target <= nums[mid]) { //target buradaysa

                    if (nums[mid] < target) {
                        low = mid + 1;
                    }
                    else {
                        high = mid - 1;
                    }
                }
                else {
                    low = mid + 1;
                }

            }

            else if (nums[mid] <= nums[high]) { //sağ sıralıysa

                if (nums[mid] <= target && target <= nums[high]) { //target buradaysa

                    if (nums[mid] < target) {
                        low = mid + 1;
                    }
                    else {
                        high = mid - 1;
                    }
                }
                else {
                    high = mid - 1;
                }

            }

        }

        return -1;
    }
}