import Home from "../pages/Home"
import StudentLogin from "../pages/Student/StudentLogin"
import StudentWorkspace from "../pages/Student/StudentWorkspace"
import ManageStudents from "../pages/Admin/ManageStudents"
import AdminWorkspace from "../pages/Admin/AdminWorkspace"
import ManageCourses from "../pages/Admin/ManageCourses"
import ManageExams from "../pages/Admin/ManageExams"
import ManageFaculties from "../pages/Admin/ManageFaculties"
import FacultyLogin from "../pages/Faculty/FacultyLogin"
// import FacultyWorkspace from "../pages/Faculty/FacultyWorkspace"
import Exam from "../pages/Faculty/Exam"
import AdminLogin from "../pages/Admin/AdminLogin"
import { FacultyWorkspace } from "../pages/Faculty/FacultyWorkspace"
import ResultPdf from "../pages/Faculty/ResultPdf"

export const loginRoutes = [
    {
        path: '/student/login',
        title: 'Student login',
        component: <StudentLogin />
    },
    {
        path: '/faculty/login',
        title: 'Faculty login',
        component: <FacultyLogin />
    },
    {
        path: '/admin/login',
        title: 'Admin login',
        component: <AdminLogin />
    }
]

export const adminWorkspaceRoutes = [
    {
        path: '/admin/workspace',
        title: 'Admin Workspace',
        component: <AdminWorkspace />
    },
    {
        path: '/admin/manage-students',
        title: 'Manage Students',
        component: <ManageStudents />
    },
    {
        path: '/admin/manage-faculties',
        title: 'Manage Faculties',
        component: <ManageFaculties />
    },
    {
        path: '/admin/manage-courses',
        title: 'Manage Courses',
        component: <ManageCourses />
    },
    {
        path: '/admin/manage-exams',
        title: 'Manage Exams',
        component: <ManageExams />
    }
];

export const facultyWorkspaceRoutes = [
    {
        path: '/faculty/workspace',
        title: 'Faculty Workspace',
        component: <FacultyWorkspace />
    },
    {
        path: '/faculty/exam/:examBatchId',
        title: 'Exam',
        component: <Exam />
    },
    {
        path: '/faculty/exam/:examBatchId/print-result',
        title: 'Print Result',
        component: <ResultPdf />
    }
];

export const studentWorkspaceRoutes = [
    {
        path: '/student/workspace',
        title: 'Student Workspace',
        component: <StudentWorkspace />
    }
]

export const defaultRoutes = [
    {
        path: '/',
        title: "Home",
        component: <Home />
    }
]