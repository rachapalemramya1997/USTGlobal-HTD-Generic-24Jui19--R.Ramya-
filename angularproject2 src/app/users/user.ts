export class User {
    constructor(
        public name: string,
        public email: string,
        public phno: number,
        public id ?: string ) {}
}
// ng g class users it create new class