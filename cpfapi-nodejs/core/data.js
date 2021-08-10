const data = [];

const addcpf = function (cpf, description) {

    const newData = { cpf, description, desc_historic: [] };
    data.push(newData);

    return newData;
};

const getIdxCpf = function (cpf) {

    return data.findIndex((v) => v.cpf === cpf)
};

const allCpf = function () {
    return data;
};

const findCpf = function (cpf) {

    const idx = data.findIndex((v) => v.cpf === cpf);

    return idx !== -1 && data[idx];
};

const deleteCpf = function (cpf) {

    const idx = data.findIndex((v) => v.cpf === cpf);

    return idx !== -1 && data.splice(idx, 1)[0];
}

const alteDescCPF = function (cpf, desc) {

    const idx = data.findIndex((v) => v.cpf === cpf);

    if (idx === -1)
        return false;

    data[idx].desc_historic.push(data[idx].description);
    data[idx].description = desc;

    return data[idx];
}

module.exports = { addcpf, getIdxCpf, allCpf, findCpf, deleteCpf, alteDescCPF };