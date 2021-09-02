const Air = require("./Air")


class Plane extends Air {

    constructor(passenger, typeFuel, velocityMax, model) {
        super(passenger, typeFuel, velocityMax);
        this._model = model;
    };

    getModel(){
        return this._model;
    };

    setModel(model){
        this._model = model;
    };

    voar() { };

}

module.exports = Plane;