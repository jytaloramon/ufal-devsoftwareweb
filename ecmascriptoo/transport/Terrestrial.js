const Vehicle = require("./Vehicle")


class Terrestrial extends Vehicle {

    constructor(brand, passenger, typeFuel, velocityMax, color) {
        super(passenger, typeFuel, velocityMax);
        this._brand = brand
        this._color = color;
    };

    getBrand() {
        return this._brand;
    };

    setBrand(brand) {
        this._brand = brand;
    };

    gerColor() {
        return this._color;
    }

    setColor(color) {
        this._color = color;
    };

    run() { };

}

module.exports = Terrestrial;