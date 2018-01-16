/*
Вы планируете совершить ограбление на улице Ленина, и вам известно сколько спрятано денег в каждом доме. Но есть проблема – в домах установлена система безопасности. Сигнализация срабатывает при проникновении в два соседних дома.
В вашем распоряжении массив не отрицательных целых чисел nums где каждый элемент представляет собой сумму денег спрятанную в каждом доме. Ваша задача расчитать максимальную сумму котою можно украсть не спровоцировав сигнализацию.
Например для nums = [5, 5, 5] результат должен быть равен 10 т.к. максимальная прибыль будет получена при грабеже 1ого и 3его домов.
Для nums = [1, 3, 1, 3, 100] результат должен быть равен 103
*/

var numsExample = [{
    seria: [1, 3, 1, 3, 100],
    answer: 103
},
    {
        seria: [5, 5, 5],
        answer: 10
    },
    {
        seria: [1, 3, 4, 10, 100],
        answer: 105
    },
    {
        seria: [1, 90, 4, 20, 100],
        answer: 190
    }
];

function test() {
    var errCount = 0;
    for (var i = 0; i< numsExample.length; i++) {
        var expected = numsExample[i].answer;
        var result = houseRobber(numsExample[i].seria);
        if (expected !== result) {
            console.log("Error in example " + numsExample[i].seria + " expected " + expected + " result " + result );
            errCount +=1;
        }
    }

    if (errCount > 0 ) {
        console.log("tests not passed! Errors count:"+errCount);
    } else {
        console.log("Congratulations! Tests passed!");
    }

}

function houseRobber(nums) {
    // edge cases
    if (nums.length == 0) {
        return 0;
    }
    if (nums.length == 1) {
        return nums[0];
    }
    if (nums.length == 2) {
        return Math.max(nums[0], nums[1]);
    }

    // обрабатываем начало массива, нам важно что больше
    // - первый элемент + houseRobber примененный к остатку массива начиная с 3 элемента(индекс 2)
    // или houseRobber примененный к массиву начиная с элемента 2
    var firstArr = nums.slice(2);
    var secondArr = nums.slice(1);

    return Math.max(nums[0] + houseRobber(firstArr), houseRobber(secondArr));


}

test();
