package com.javarush.led.module02.lesson06;

public interface Data {

    String text = """
                        Смартфон Apple iPhone 11 64Gb (Black)				51,990			59,990
                        Смартфон Apple iPhone 11 64Gb (White)				51,990			59,990
                        Смартфон Apple iPhone 13 128Gb (Black)				82,990			89,990
                        Смартфон Apple iPhone 13 128Gb (Blue)				82,990			89,990
                        Смартфон Apple iPhone 13 Pro 128Gb (Blue)				108,990			119,990
                        Смартфон Apple iPhone 13 Pro 128Gb (Gold)				108,990			119,990
                        Смартфон Apple iPhone 13 Pro Max 128Gb (Blue)				119,990			129,990
                        Смартфон Apple iPhone 13 Pro Max 128Gb (Gold)				119,990			129,990
                        Смартфон Realme 8i 128Gb (Purple)				19,990			21,990
                        Смартфон Realme C11 (2021) 32Gb (Blue)				9,990			10,990
                        Смартфон Samsung SM-A022G Galaxy A02 32GB (Black)				10,790			11,490
                        Смартфон Samsung SM-A022G Galaxy A02 32GB (Blue)				10,790			11,490
                        Смартфон Samsung SM-A022G Galaxy A02 32GB (Red)				10,790			11,490
                        Смартфон Samsung SM-A032 Galaxy A03 Core 32Gb (Black)				9,990			10,490
                        Смартфон Samsung SM-A032 Galaxy A03 Core 32Gb (Blue)				9,990			10,490
                        Смартфон Samsung SM-A035F Galaxy A03 64Gb (Black)				13,490			13,990
                        Смартфон Samsung SM-A035F Galaxy A03 64Gb (Red)				13,490			13,990
                        Смартфон Samsung SM-A125F Galaxy A12 32GB (Black)				14,490			14,990
                        Смартфон Samsung SM-A125F Galaxy A12 32GB (Blue)				14,490			14,990
                        Смартфон Samsung SM-A125F Galaxy A12 32GB (Red)				14,490			14,990
                        Смартфон Samsung SM-A125F Galaxy A12 64GB (Black)				16,790			17,990
                        Смартфон Samsung SM-A125F Galaxy A12 64GB (Blue)				16,790			17,990
                        Смартфон Samsung SM-A125F Galaxy A12 64GB (Red)				16,790			17,990
                        Смартфон Samsung SM-A225 Galaxy A22 64GB (Black)				20,990			22,990
                        Смартфон Samsung SM-A225 Galaxy A22 64GB (Green)				20,990			22,990
                        Смартфон Samsung SM-A226 Galaxy A22S 64GB (Green)				18,490			20,990
                        Смартфон Samsung SM-A226 Galaxy A22S 64GB (White)				18,490			20,990
                        Смартфон Samsung SM-A325F Galaxy A32 128GB (Blue)				25,790			27,490
                        Смартфон Samsung SM-A325F Galaxy A32 64GB (Black)				23,490			25,990
                        Смартфон Samsung SM-A325F Galaxy A32 64GB (Blue)				23,490			25,990
                        Смартфон Samsung SM-A325F Galaxy A32 64GB (Purple)				23,490			25,990
                        Смартфон Samsung SM-A525F Galaxy A52 128GB (Black)				32,990			34,990
                        Смартфон Samsung SM-A525F Galaxy A52 128GB (Blue)				32,990			34,990
                        Смартфон Samsung SM-A525F Galaxy A52 128GB (Purple)				32,990			34,990
                        Смартфон Samsung SM-M127F Galaxy M12 32GB (Black)				13,990			14,990
                        Смартфон Samsung SM-M127F Galaxy M12 32GB (Green)				13,990			14,990
                        Смартфон Samsung SM-M127F Galaxy M12 64GB (Black)				15,990			16,990
                        Смартфон Samsung SM-M127F Galaxy M12 64GB (Blue)				15,990			16,990
                        Смартфон Samsung SM-M127F Galaxy M12 64GB (Green)				15,990			16,990
                        Смартфон Samsung SM-M127F Galaxy M12 64GB (Green)				15,990			16,990
                        Смартфон Vertex Impress Luck NFC 4G (Black)				3,990			4,990
                        Смартфон Vertex Impress Luck NFC 4G (Blue)				3,990			4,990
                        Смартфон Xiaomi 11 Lite 5G NE 128Gb (Black)				29,990			34,990
                        Смартфон Xiaomi 11 Lite 5G NE 128Gb (Blue)				29,990			34,990
                        Смартфон Xiaomi 11 Lite 5G NE 128Gb (Green)				29,990			34,990
                        Смартфон Xiaomi 11 Lite 5G NE 128Gb (Pink)				29,990			34,990
                        Смартфон Xiaomi 11 Lite 5G NE 128Gb (White)				29,990			34,990
                        Смартфон Xiaomi 11 Lite 5G NE 256Gb (White)				33,490			37,990
                        Смартфон Xiaomi 11T 128Gb (Gray)				37,990			44,990
                        Смартфон Xiaomi 11T 128Gb (White)				37,990			44,990
                        Смартфон Xiaomi 11T 256Gb (White)				43,490			49,990
                        Смартфон Xiaomi POCO M4 Pro 128Gb (Blue)				23,990			25,990
                        Смартфон Xiaomi POCO M4 Pro 64Gb (Black)				21,490			23,990
                        Смартфон Xiaomi POCO M4 Pro 64Gb (Blue)				21,490			23,990
                        Смартфон Xiaomi POCO M4 Pro 64Gb (Yellow)				21,490			23,990
                        Смартфон Xiaomi POCO X3 Pro 128Gb (Blue)				28,490			29,990
                        Смартфон Xiaomi POCO X3 Pro 128Gb (Bronze)				28,490			29,990
                        Смартфон Xiaomi Redmi 10 64Gb (Blue)				19,990			20,990
                        Смартфон Xiaomi Redmi 10 64Gb (Gray)				19,990			20,990
                        Смартфон Xiaomi Redmi 10 64Gb (White)				19,990			20,990
                        Смартфон Xiaomi Redmi 9A 32Gb/2Gb (Blue)				9,990			10,990
                        Смартфон Xiaomi Redmi 9A 32Gb/2Gb (Gray)				9,990			10,990
                        Смартфон Xiaomi Redmi 9A 32Gb/2Gb (Green)				9,990			10,990
                        Смартфон Xiaomi Redmi 9C 32Gb (Blue)				10,990			11,990
                        Смартфон Xiaomi Redmi 9C 32Gb (Gray)				10,990			11,990
                        Смартфон Xiaomi Redmi 9C 32Gb (Orange)				10,990			11,990
                        Смартфон Xiaomi Redmi Note 10 Pro 128GB (Blue)				28,990			29,990
                        Смартфон Xiaomi Redmi Note 10 Pro 128GB (Bronze)				28,990			29,990
                        Смартфон Xiaomi Redmi Note 10 Pro 128GB (Gray)				28,990			29,990
                        Смартфон Xiaomi Redmi Note 10S 128Gb (Blue)				23,790			25,990
                        Смартфон Xiaomi Redmi Note 10S 128Gb (Gray)				23,790			25,990
                        Смартфон Xiaomi Redmi Note 10S 128Gb (White)				23,790			25,990
                        Смартфон Xiaomi Redmi Note 10S 64Gb (Blue)				21,790			25,990
                        Смартфон Xiaomi Redmi Note 10S 64Gb (Gray)				21,790			25,990
                        Смартфон Xiaomi Redmi Note 10S 64Gb (White)				21,790			25,990
                        Смартфон Xiaomi Redmi Note 11 128Gb (Graphite Gray)				24,990			27,990
                        Смартфон Xiaomi Redmi Note 11 128Gb (Star Blue)				24,990			27,990
                        Смартфон Xiaomi Redmi Note 11 128Gb (Twilight Blue)				24,990			27,990
                        Смартфон Xiaomi Redmi Note 11 64Gb (Graphite Gray)				22,990			25,990
                        Смартфон Xiaomi Redmi Note 11 64Gb (Star Blue)				22,990			25,990
                        Смартфон Xiaomi Redmi Note 11 64Gb (Twilight Blue)				22,990			25,990
                        Смартфон Xiaomi Redmi Note 11 Pro 128Gb (Gray)				39,990			40,990
                        Смартфон Xiaomi Redmi Note 11S 128Gb (Blue)				34,990			35,990
                        Смартфон Xiaomi Redmi Note 11S 128Gb (Gray)				34,990			35,990
                        Смартфон Xiaomi Redmi Note 11S 64Gb (Blue)				32,990			33,990
                        Смартфон Xiaomi Redmi Note 11S 64Gb (Gray)				32,990			33,990
            """;
}
