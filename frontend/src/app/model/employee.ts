export interface Employee{
    id:number,
    name:string,
    status:string,
    mobileno:string,
    emailid:string,
    salary:number,
    department:string,
    
    createdBy:string,
    createdDate:Date,
    updatedBy:string,
    updatedDate:Date,
    country:{
        cid:number,
        cname:string
    }
}