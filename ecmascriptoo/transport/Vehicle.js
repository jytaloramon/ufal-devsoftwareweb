class Vehicle {

    constructor(passenger, typeFuel, velocityMax) {
        this._passenger = passenger;
        this._typeFuel = typeFuel;
        this._velocityMax = velocityMax;
    };

    getPassenger() {
        return this._passenger;
    };

    setPassenger(passenger) {
        this._passenger = passenger;
    };

    getTypeFuel() {
        return this._typeFuel;
    };

    setTypeFuel(typeFuel) {
        this._typeFuel = typeFuel;
    };

    getVelocityMax() {
        return this._velocityMax;
    };

    setVelocityMax(velocityMax) {
        this._velocityMax = velocityMax;
    };

    turnOn() { };

}

module.exports = Vehicle;